SUMMARY="Intel unified LibRSU (Remote System Update) library"
LICENSE = "MIT-0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08e5b346f14e1877a2c2a2de82d2d4a1"

SRC_URI = "git://github.com/intel-innersource/libraries.fpga.unified-librsu.git;protocol=https;branch=main;"

PV = "1.0+git${SRCPV}"
SRCREV="d60b6e2aecf647b79a3f656a838c838fe000b007"
DEPENDS = "zlib"

FILES:${PN} = "/usr/lib/* \
	           /include/*"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DPLATFORM=linux-aarch64"

do_install(){
    cmake --install ${B} --prefix=${D} --component uniLibRSU_lib_Runtime
}