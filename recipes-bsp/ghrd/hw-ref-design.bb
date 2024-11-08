SUMMARY = "Intel SoCFPGA Golden Hardware Reference Design (GHRD)"
DESCRIPTION = "Prebuilt FPGA bitstream for SOC Development Kit"
SECTION = "bsp"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

inherit deploy

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"

IMAGE_TYPE ?= "gsrd"

RBO_RELEASE_VER ?= "2024.09"
GHRD_REPO ?= "https://releases.rocketboards.org/release/${RBO_RELEASE_VER}/rbf-source"

ARM64_GHRD_CORE_RBF = "ghrd.core.rbf"
A10_GHRD_CORE_RBF = "ghrd_10as066n2.core.rbf"
A10_GHRD_PERIPH_RBF = "ghrd_10as066n2.periph.rbf"
C5_GHRD_CORE_RBF = "soc_system.rbf"

SRC_URI:agilex5_dk_a5e065bb32aes1 ?= "\
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_gsrd_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_nand_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_nand_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_emmc_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_emmc_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_tsnconfig2_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_tsnconfig2_core \
		file://agilex5_dk_a5e065bb32aes1_aic0_ghrd.core.rbf \
		file://agilex5_dk_a5e065bb32aes1_debug2_ghrd.core.rbf \
		"

SRC_URI:agilex5_dk_a5e013bb32aesi0 ?= "\
		${GHRD_REPO}/agilex5_dk_a5e013bb32aesi0_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aesi0_gsrd_core \
		${GHRD_REPO}/agilex5_dk_a5e013bb32aesi0_nand_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aesi0_nand_core \
		${GHRD_REPO}/agilex5_dk_a5e013bb32aesi0_emmc_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aesi0_emmc_core \
		"

SRC_URI:agilex5_dk_a5e013bb32aes ?= "\
		${GHRD_REPO}/agilex5_dk_a5e013bb32aes_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aes_gsrd_core \
		${GHRD_REPO}/agilex5_dk_a5e013bb32aes_nand_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aes_nand_core \
		${GHRD_REPO}/agilex5_dk_a5e013bb32aes_emmc_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e013bb32aes_emmc_core \
		"

SRC_URI:agilex5_modular ?= "\
		${GHRD_REPO}/agilex5_modular_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_modular_gsrd_core \
		"

SRC_URI:agilex5_mudv_cvr ?= "\
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_gsrd_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_nand_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_nand_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_emmc_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_emmc_core \
		file://agilex5_dk_a5e065bb32aes1_aic0_ghrd.core.rbf \
		file://agilex5_dk_a5e065bb32aes1_debug2_ghrd.core.rbf \
		"

SRC_URI:agilex5_mucv ?= "\
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_gsrd_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_nand_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_nand_core \
		${GHRD_REPO}/agilex5_dk_a5e065bb32aes1_emmc_${ARM64_GHRD_CORE_RBF};name=agilex5_dk_a5e065bb32aes1_emmc_core \
		file://agilex5_dk_a5e065bb32aes1_aic0_ghrd.core.rbf \
		file://agilex5_dk_a5e065bb32aes1_debug2_ghrd.core.rbf \
		"

SRC_URI:agilex7_dk_si_agf014ea ?= "\
		${GHRD_REPO}/agilex7_dk_si_agf014ea_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014ea_gsrd_core \
		${GHRD_REPO}/agilex7_dk_si_agf014ea_nand_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014ea_nand_core \
		${GHRD_REPO}/agilex7_dk_si_agf014ea_pr_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014ea_pr_core \
		${GHRD_REPO}/agilex7_dk_si_agf014ea_pr_persona0.rbf;name=agilex7_dk_si_agf014ea_pr_persona0 \
		${GHRD_REPO}/agilex7_dk_si_agf014ea_pr_persona1.rbf;name=agilex7_dk_si_agf014ea_pr_persona1 \
		"

SRC_URI:agilex7_dk_si_agf014eb ?= "\
		${GHRD_REPO}/agilex7_dk_si_agf014eb_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014eb_gsrd_core \
		${GHRD_REPO}/agilex7_dk_si_agf014eb_nand_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014eb_nand_core \
		${GHRD_REPO}/agilex7_dk_si_agf014eb_pr_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agf014eb_pr_core \
		${GHRD_REPO}/agilex7_dk_si_agf014eb_pr_persona0.rbf;name=agilex7_dk_si_agf014eb_pr_persona0 \
		${GHRD_REPO}/agilex7_dk_si_agf014eb_pr_persona1.rbf;name=agilex7_dk_si_agf014eb_pr_persona1 \
		"

SRC_URI:agilex7_dk_si_agi027fb ?= "\
		${GHRD_REPO}/agilex7_dk_si_agi027fb_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agi027fb_gsrd_core \
		"

SRC_URI:agilex7_dk_si_agi027fa ?= "\
		${GHRD_REPO}/agilex7_dk_si_agi027fa_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agi027fa_gsrd_core \
		"

SRC_URI:agilex7_dk_si_agi027fc ?= "\
		${GHRD_REPO}/agilex7_dk_si_agi027fc_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_si_agi027fc_gsrd_core \
		"

SRC_URI:agilex7_dk_dev_agf027f1es ?= "\
		${GHRD_REPO}/agilex7_dk_dev_agf027f1es_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_dev_agf027f1es_gsrd_core \
		"

SRC_URI:agilex7_dk_dev_agm039fes ?= "\
		${GHRD_REPO}/agilex7_dk_dev_agm039fes_gsrd_${ARM64_GHRD_CORE_RBF};name=agilex7_dk_dev_agm039fes_gsrd_core \
		"

SRC_URI:stratix10 ?= "\
		${GHRD_REPO}/stratix10_gsrd_${ARM64_GHRD_CORE_RBF};name=stratix10_gsrd_core \
		${GHRD_REPO}/stratix10_nand_${ARM64_GHRD_CORE_RBF};name=stratix10_nand_core \
		${GHRD_REPO}/stratix10_pr_${ARM64_GHRD_CORE_RBF};name=stratix10_pr_core \
		${GHRD_REPO}/stratix10_pr_persona0.rbf;name=stratix10_pr_persona0 \
		${GHRD_REPO}/stratix10_pr_persona1.rbf;name=stratix10_pr_persona1 \
		"

SRC_URI:stratix10_htile ?= "\
		${GHRD_REPO}/stratix10_htile_gsrd_${ARM64_GHRD_CORE_RBF};name=stratix10_htile_gsrd_core \
		${GHRD_REPO}/stratix10_htile_nand_${ARM64_GHRD_CORE_RBF};name=stratix10_htile_nand_core \
		${GHRD_REPO}/stratix10_htile_pr_${ARM64_GHRD_CORE_RBF};name=stratix10_htile_pr_core \
		${GHRD_REPO}/stratix10_htile_pr_persona0.rbf;name=stratix10_htile_pr_persona0 \
		${GHRD_REPO}/stratix10_htile_pr_persona1.rbf;name=stratix10_htile_pr_persona1 \
		"

SRC_URI:arria10 ?= "\
		${GHRD_REPO}/arria10_${IMAGE_TYPE}_hps.xml;name=arria10_${IMAGE_TYPE}_hps_xml \
		${GHRD_REPO}/arria10_${IMAGE_TYPE}_${A10_GHRD_CORE_RBF};name=arria10_${IMAGE_TYPE}_core \
		${GHRD_REPO}/arria10_${IMAGE_TYPE}_${A10_GHRD_PERIPH_RBF};name=arria10_${IMAGE_TYPE}_periph \
		${@bb.utils.contains("IMAGE_TYPE", "pr", "${GHRD_REPO}/arria10_${IMAGE_TYPE}_persona0.rbf;name=arria10_pr_persona0", "", d)} \
		${@bb.utils.contains("IMAGE_TYPE", "pr", "${GHRD_REPO}/arria10_${IMAGE_TYPE}_persona1.rbf;name=arria10_pr_persona1", "", d)} \
		"

SRC_URI:cyclone5 ?= "${GHRD_REPO}/cyclone5_${IMAGE_TYPE}_${C5_GHRD_CORE_RBF};name=cyclone5_${IMAGE_TYPE}_core"

SRC_URI[agilex5_dk_a5e065bb32aes1_gsrd_core.sha256sum] = "d87a2f5cb08c5ff060ea768ad0f853b5454b971365f0e1697de61e9dae3108a2"
SRC_URI[agilex5_dk_a5e065bb32aes1_nand_core.sha256sum] = "eee90c66fcf288bab29eaf7047eec2fd13a3b96bd0f14545cfe070e5930a59e9"
SRC_URI[agilex5_dk_a5e065bb32aes1_emmc_core.sha256sum] = "fdca4bb4a84769a48cc8e81e13bd3649db427dca5e3d04d54bb76bda27e466b1"
SRC_URI[agilex5_dk_a5e065bb32aes1_tsnconfig2_core.sha256sum] = "938222b22264c3d6b6f21ffcf8ed382371fd1d5cfad3a9ae6848104e5cba6a37"

SRC_URI[agilex5_dk_a5e013bb32aesi0_gsrd_core.sha256sum] = "9d7280dad7abb80bb6708ec12cb7378ceb99d905b2926d1a07c96ee4d294e92f"
SRC_URI[agilex5_dk_a5e013bb32aesi0_nand_core.sha256sum] = "0aea44558e305d73841e080c943fbb490472af81e0ff2d70d220e85ebb31e22e"
SRC_URI[agilex5_dk_a5e013bb32aesi0_emmc_core.sha256sum] = "90166815492b0d930515032b27c6d9ad3f9032d7f1a6eb8738530f460de08440"

SRC_URI[agilex5_modular_gsrd_core.sha256sum] = "321deccbd45b40212cb58c9363d3516fbe0ae2b23afa7a51d28db9b50bef9c29"

SRC_URI[agilex7_dk_si_agf014ea_gsrd_core.sha256sum] = "7b0af3489bc723c99d1ef695f9b5995ad788779e43a5e42df195b920c63f0890"
SRC_URI[agilex7_dk_si_agf014ea_nand_core.sha256sum] = "3b3ca7328910920156037aea186c99b75d23a14b773ae2356ebef68d0586fec8"
SRC_URI[agilex7_dk_si_agf014ea_pr_core.sha256sum] = "34f59dca1f79b061118614685c249111778bc21354823e6b2795d733eed66e5f"
SRC_URI[agilex7_dk_si_agf014ea_pr_persona0.sha256sum] = "529e80cba5bba5e12dd2b6eb38b7cb5a2cd2c4577d8c482447ab73ae64ade0d9"
SRC_URI[agilex7_dk_si_agf014ea_pr_persona1.sha256sum] = "aec9f958470545a3c0f6ae2f4c0247f752b0f9d7234fed823863bb56626d9137"

SRC_URI[agilex7_dk_si_agf014eb_gsrd_core.sha256sum] = "a4aff450226740e520a47542c794be001534e767abcc3ccc01485558d32de7fc"
SRC_URI[agilex7_dk_si_agf014eb_nand_core.sha256sum] = "d76696b566c0bb02557747e585b84303119a664c3d21d697de77b8a0767e65b5"
SRC_URI[agilex7_dk_si_agf014eb_pr_core.sha256sum] = "f7e23475337a2a2a957b94f090addd12fbf5f17b743bfd585447727dcd1b6b4f"
SRC_URI[agilex7_dk_si_agf014eb_pr_persona0.sha256sum] = "3d1aff3675567a671d291c637635498de0fbedf0bbb1d402779c34774f1b4648"
SRC_URI[agilex7_dk_si_agf014eb_pr_persona1.sha256sum] = "99205e7656e415cf7b325ce56de41f429606fd3d5ed8e707bb072d671201517c"

SRC_URI[agilex7_dk_si_agi027fb_gsrd_core.sha256sum] = "79ad0a98a10d1045f7f5394ee212443e8acd7cd34440d0ad5c7524053edc09f7"
SRC_URI[agilex7_dk_si_agi027fa_gsrd_core.sha256sum] = "d3b9d8d0fbb1140329ba5909dab3d1dd01c93ec180cc04c49610978b02809fd3"
SRC_URI[agilex7_dk_si_agi027fc_gsrd_core.sha256sum] = "e044831109bb00da1fd0bf083e4fe3a10076d914600876a33995309f4e723ae8"
SRC_URI[agilex7_dk_dev_agf027f1es_gsrd_core.sha256sum] = "b565c58bfa3ffd133b1923583709389eab0de4d6a5395af9b59ff74eaef6e183"

SRC_URI[agilex7_dk_dev_agm039fes_gsrd_core.sha256sum] = "fadcc590048f9183c50e872b52d0299d524c778800949db43beb4ceb4a192cf0"

SRC_URI[stratix10_gsrd_core.sha256sum] = "9d494338468911f46d7025bc3694c436fa9c64febe33d29f5480348a632ba300"
SRC_URI[stratix10_nand_core.sha256sum] = "8372c0e4e8b0a7492fa982a34b5066602450b140ebbdb3e956a7ef438d673d2c"
SRC_URI[stratix10_pr_core.sha256sum] = "5845a91a6ae31b14ad638330f446a6095c272a923b2af5c29f63bfd25356d616"
SRC_URI[stratix10_pr_persona0.sha256sum] = "9f5c854878ee703a798b50f91ef96f81052c58701a8dbc54aee341e4e64cab66"
SRC_URI[stratix10_pr_persona1.sha256sum] = "373d8f1e3247190f46745e95defe6bc976c924d113dfe55a5dea235a2c342a9f"

SRC_URI[stratix10_htile_gsrd_core.sha256sum] = "9ea5a2e8a6da5c20d8bf992451f964a1a903704cf39ae78f89dde17cb0ace20f"
SRC_URI[stratix10_htile_nand_core.sha256sum] = "6cb6fd529725b5f9ec86227c84bfd97c0b8a2355f2216fc580fc600488a8a398"
SRC_URI[stratix10_htile_pr_core.sha256sum] = "286176ebcce3bee874628aeeae8b37ae2b959d47a55f645758e7910bebd20c98"
SRC_URI[stratix10_htile_pr_persona0.sha256sum] = "5c38a1e891ba9de2af8ea4ae0ee89608409151893c63f4e76ea113d89ee8b8ad"
SRC_URI[stratix10_htile_pr_persona1.sha256sum] = "f876178ddec74ee12eaa6f9ae39ea05a8700b5d37e083affdc05fc462df20dcb"

SRC_URI[arria10_gsrd_core.sha256sum] = "ea167391a799fbfac2b956c5d64beb3f9cb041fb5a2c45778c8fc97338358f79"
SRC_URI[arria10_gsrd_periph.sha256sum] = "761706b95e5eaf8a7369d7b40f3175be10ff2efed03074f1437bc7288472518e"
SRC_URI[arria10_gsrd_hps_xml.sha256sum] = "53f2ace439d40c8262ca21b7199446ea3325927daa0573c4dfd6c8d3a3970f2f"
SRC_URI[arria10_nand_core.sha256sum] = "e29449775d7882270fa9198caac54b4f9749ec775348f0b67d343d49961e17ae"
SRC_URI[arria10_nand_periph.sha256sum] = "7f2cfdd87d5c16026bf4e1e61d1ee478db91243e7e6c9f97fcd369d86ef39536"
SRC_URI[arria10_nand_hps_xml.sha256sum] = "7921b4e12e7e3acd8b2f4d20dfb77da0d29d439baadd2640222c1bbb9ace5f91"
SRC_URI[arria10_pcie_core.sha256sum] = "d07ff4e2dd35ca54cda4d819759c65f3525ed0a4ea5080cf935f98c3d69bba3b"
SRC_URI[arria10_pcie_periph.sha256sum] = "472f9dec377e0f55717092745798fc6681c7d732ecdb7c16f0d3d7193ef02341"
SRC_URI[arria10_pcie_hps_xml.sha256sum] = "b716d8201edf6755329cc5a72b9e8925a12cda4ca2a38139712c4e57b42733c0"
SRC_URI[arria10_pr_core.sha256sum] = "fc22d4f3c84c641118164841b8574bf932ac15dd86c9b23741bad7b0fd38efe0"
SRC_URI[arria10_pr_periph.sha256sum] = "026e469e217275e03afb2a001f3eadd4c450200e5f94a39aa724978405241bbf"
SRC_URI[arria10_pr_hps_xml.sha256sum] = "a766afda58479371a3ced9a9ed023d093a716713481098c390c5e3c040893cfc"
SRC_URI[arria10_pr_persona0.sha256sum] = "e72198e821451873fabe1c70d7690de58ad9fb0ce1b1c0b5a48a4b056379b46d"
SRC_URI[arria10_pr_persona1.sha256sum] = "df022ae0720fe391e125121e10f2a0d0269a62118fdbc7cb1d906da069fc1e75"
SRC_URI[arria10_qspi_core.sha256sum] = "44819e7a2c7032910623929ade63af1646844af0134e71ce2e175cad8c119dff"
SRC_URI[arria10_qspi_periph.sha256sum] = "ae0d1d4e5bab88cbe01730d55401403f6a56c854c3565634a34bf0cdb8f6600e"
SRC_URI[arria10_qspi_hps_xml.sha256sum] = "9db4939e9217637295c4fdc17f85fe8fb01cc3012ad9040e9181899f4df567bc"
SRC_URI[arria10_sgmii_core.sha256sum] = "9d1329cf9bb69309e2d17998c69b7ae1b8130399cb90bfb5f73c7851fbedbd0a"
SRC_URI[arria10_sgmii_periph.sha256sum] = "9759ea684e0c8e957d2d90b20f254300c9c0c11e9fdf5074949d34723a75b29c"
SRC_URI[arria10_sgmii_hps_xml.sha256sum] = "7107d96bc904737adfd51e1d958b5453384308b0537642382b3845c7fbdae9f0"
SRC_URI[arria10_tse_core.sha256sum] = "b668d817be11dd8fc549e3790a208387c3c5fb5937d334c3c0a98e8586943af9"
SRC_URI[arria10_tse_periph.sha256sum] = "dfe87889316217a84b9034efc64ba7f85c076475a1961f646bb07630afb29e14"
SRC_URI[arria10_tse_hps_xml.sha256sum] = "822e09b1418a8ec4f07f61421bed3b50d203d3c18aed09672df8064f388bce7d"

SRC_URI[cyclone5_gsrd_core.sha256sum] = "0498c9c97e48e2e6de97410b998d6f9d751c630e233071234b146d2ee399f268"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

PROVIDES = "virtual/bitstream"

FILES:${PN} = " \
		/boot \
		/usr/lib/firmware \
		"

PACKAGES = "${PN}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install () {
	if [[ "${MACHINE}" == *"agilex7_"* ]]; then
		if [[ "${MACHINE}" == *"agilex7_dk_si_agf014e"* ]]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${D}/boot/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${D}/boot/ghrd_pr.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${D}${base_libdir}/firmware/persona0.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${D}${base_libdir}/firmware/persona1.rbf
		else
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
		fi
	fi

	if ${@bb.utils.contains("MACHINE", "stratix10", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${D}/boot/nand.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${D}/boot/ghrd_pr.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${D}${base_libdir}/firmware/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${D}${base_libdir}/firmware/persona1.rbf
	fi

	if ${@bb.utils.contains("MACHINE", "stratix10_htile", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${D}/boot/nand.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${D}/boot/ghrd_pr.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${D}${base_libdir}/firmware/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${D}${base_libdir}/firmware/persona1.rbf
	fi

	if ${@bb.utils.contains("MACHINE", "cyclone5", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_${C5_GHRD_CORE_RBF} ${D}/boot/${C5_GHRD_CORE_RBF}
	fi

	if ${@bb.utils.contains("IMAGE_TYPE", "pr", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_persona0.rbf ${D}${base_libdir}/firmware/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_persona1.rbf ${D}${base_libdir}/firmware/persona1.rbf
	fi
	
	if [[ "${MACHINE}" == *"agilex5_"* ]]; then
		if [ "${MACHINE}" == "agilex5_modular" ]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
		elif [[ "${MACHINE}" == *"agilex5_dk_a5e"* ]]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${D}/boot/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_emmc_${ARM64_GHRD_CORE_RBF} ${D}/boot/emmc.core.rbf
			if [ "${MACHINE}" == "agilex5_dk_a5e065bb32aes1" ]; then
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_aic0_ghrd.core.rbf ${D}/boot/aic0.core.rbf
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_debug2_ghrd.core.rbf ${D}/boot/debug2.core.rbf
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_tsnconfig2_ghrd.core.rbf ${D}/boot/tsnconfig2.core.rbf
			fi
		else
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_gsrd_${ARM64_GHRD_CORE_RBF} ${D}/boot/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_nand_${ARM64_GHRD_CORE_RBF} ${D}/boot/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_emmc_${ARM64_GHRD_CORE_RBF} ${D}/boot/emmc.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_aic0_ghrd.core.rbf ${D}/boot/aic0.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_debug2_ghrd.core.rbf ${D}/boot/debug2.core.rbf
		fi
	fi
}

do_deploy () {
	if [[ "${MACHINE}" == *"agilex5_"* ]]; then
		if [ "${MACHINE}" == "agilex5_modular" ]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${ARM64_GHRD_CORE_RBF}
		elif [[ "${MACHINE}" == *"agilex5_dk_a5e"* ]]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_emmc_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/emmc.core.rbf
			if [ "${MACHINE}" == "agilex5_dk_a5e065bb32aes1" ]; then
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_aic0_ghrd.core.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/aic0.core.rbf
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_debug2_ghrd.core.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/debug2.core.rbf
				install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_tsnconfig2_ghrd.core.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/tsnconfig2.core.rbf
			fi
		else
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_nand_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_emmc_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/emmc.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_aic0_ghrd.core.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/aic0.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/agilex5_dk_a5e065bb32aes1_debug2_ghrd.core.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/debug2.core.rbf
		fi
	fi

	if [[ "${MACHINE}" == *"agilex7_"* ]]; then
		if [[ "${MACHINE}" == *"agilex7_dk_si_agf014e"* ]]; then
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_gsrd_ghrd/${ARM64_GHRD_CORE_RBF}
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/nand.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/ghrd_pr.core.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona0.rbf
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona1.rbf
		else
			install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_gsrd_ghrd/${ARM64_GHRD_CORE_RBF}
		fi
	fi

	if ${@bb.utils.contains("MACHINE", "stratix10", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_gsrd_ghrd/${ARM64_GHRD_CORE_RBF}
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/nand.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/ghrd_pr.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona1.rbf
	fi

	if ${@bb.utils.contains("MACHINE", "stratix10_htile", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_gsrd_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_gsrd_ghrd/${ARM64_GHRD_CORE_RBF}
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_nand_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/nand.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_${ARM64_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/ghrd_pr.core.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona0.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_pr_persona1.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona1.rbf
	fi

	if ${@bb.utils.contains("MACHINE", "arria10", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_hps.xml ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/hps.xml
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_${A10_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${A10_GHRD_CORE_RBF}
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_${A10_GHRD_PERIPH_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${A10_GHRD_PERIPH_RBF}
	fi

	if ${@bb.utils.contains("MACHINE", "cyclone5", "true", "false", d)} ; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_${C5_GHRD_CORE_RBF} ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/${C5_GHRD_CORE_RBF}
	fi

	if ${@bb.utils.contains("IMAGE_TYPE", "pr", "true", "false", d)}; then
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_persona0.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona0.rbf
		install -D -m 0644 ${WORKDIR}/sources/${MACHINE}_${IMAGE_TYPE}_persona1.rbf ${DEPLOYDIR}/${MACHINE}_${IMAGE_TYPE}_ghrd/persona1.rbf
	fi
}

addtask install after do_configure before do_deploy
addtask deploy after do_install
