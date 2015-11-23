FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

COMPATIBLE_MACHINE = "(eukrea-cpuimx51)"

SRC_URI_append = " file://defconfig file://sdma-imx51.bin "
#SRC_URI_append = " file://eukrea-cpuimx51-standard.scc \
#		   file://eukrea-cpuimx51.cfg \
#	       	   file://sdma-imx51.bin "

do_compile_prepend () {
	cp ${WORKDIR}/sdma-imx51.bin ${S}/sdma-imx51.bin
}