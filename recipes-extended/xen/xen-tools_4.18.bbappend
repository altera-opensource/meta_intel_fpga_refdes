SRCREV = "${AUTOREV}"

XEN_REPO ?= "git://github.com/intel-innersource/applications.fpga.soc.xen-hypervisor.git"
XEN_PROT ?= "http"
XEN_REL ?= "4.18"
XEN_BRANCH ?= "stable-4.18"

SRC_URI = " \
        ${XEN_REPO};protocol=${XEN_PROT};branch=${XEN_BRANCH} \
	file://0001-python-pygrub-pass-DISTUTILS-xen-4.18.patch \
	"
