SUMMARY="Intel unified LibRSU (Remote System Update) Linux example client"
LICENSE = "MIT-0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08e5b346f14e1877a2c2a2de82d2d4a1"

SRC_URI = "git://github.com/intel-innersource/libraries.fpga.unified-librsu.git;protocol=https;branch=main;"

PV = "1.0+git${SRCPV}"
SRCREV="7972901d15438e8513553df929f59f06b8adb80d"
DEPENDS = "socfpga-intel-unilibrsu-lib"

FILES:${PN} = "/sbin/*"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DPLATFORM=linux-aarch64"

do_install(){
    cmake --install ${B} --prefix=${D} --component uniLibRSU_client_Runtime_GSRD
}
