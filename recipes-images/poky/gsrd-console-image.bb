require recipes-core/images/core-image-base.bb
require core-image-essential.inc

DEPENDS:append = " bash perl gcc i2c-tools"

IMAGE_INSTALL:append = " packagegroup-common-essential"
IMAGE_INSTALL:append = " packagegroup-dev-tools-essential"
IMAGE_INSTALL:append = " packagegroup-network-essential"
IMAGE_INSTALL:append = " packagegroup-core-ssh-openssh"
IMAGE_INSTALL:append = " packagegroup-web-server-essential"
IMAGE_INSTALL:append = " fio fpga-overlay nfs-utils-client perl"
IMAGE_INSTALL:append = " remote-debug-app fpgaconfig"

export IMAGE_BASENAME = "gsrd-console-image"

# NFS workaround
ROOTFS_POSTPROCESS_COMMAND:append = " nfs_rootfs ; lighttpd_rootfs ; mask_udev ; "
nfs_rootfs(){
        cd ${IMAGE_ROOTFS}/lib/systemd/system/; sed -i '/Wants/a ConditionKernelCommandLine=!root=/dev/nfs' connman.service
}

lighttpd_rootfs(){
	rm ${IMAGE_ROOTFS}/var/log; mkdir -p ${IMAGE_ROOTFS}/var/log; touch ${IMAGE_ROOTFS}/var/log/lighttpd
}

# Disable assignment of fixed ifname by masking udev's .link for default policy
mask_udev(){
	ln -sf ${IMAGE_ROOTFS}/dev/null ${IMAGE_ROOTFS}/lib/systemd/network/99-default.link
}

IMAGE_INSTALL:append = " ${@bb.utils.contains('HYP_BUILD', '1', 'libvirt stress sysbench perf fio coremark', '', d)}"

