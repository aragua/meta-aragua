require linux.inc

COMPATIBLE_MACHINE = "(eukrea-cpuimx51)"
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_eukrea-cpuimx51 = "1"

PR = "r1"

FILES_kernel-image = ""
ALLOW_EMPTY_kernel_image = "1"

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.bz2;name=kernel \
           file://defconfig "

SRC_URI_append_eukrea = " \
	file://0001-usb-fsl_mxc_udc.c-add-workaround-for-ENGcm09152-for-.patch \
	file://0002-usb-fsl_mxc_udc.c-fix-mxc_ahb_clk-disable-for-i.MX25.patch \
	file://0003-ARM-imx-eukrea_cpuimx25-enable-workaround-ENGcm09152.patch \
	file://0004-ARM-imx-eukrea_mbimxsd25-add-spi-controler-and-spide.patch \
	file://0005-ARM-imx-eukrea_cpuimx25-add-watchdog-support.patch \
	file://0006-ARM-imx-eukrea_mbimxsd35-add-spi-controler-and-spide.patch \
	file://0007-ARM-imx-eukrea-cpuimx51-remove-board.patch \
	file://0008-ARM-imx-eukrea_cpuimx51sd-add-watchdog-support.patch \
	file://0009-ARM-imx-eukrea_mbimxsd-add-audio-support.patch \
	file://0010-ARM-imx-eukrea_cpuimx51sd-support-rev2-PCB.patch \
	file://0011-ARM-imx-eukrea_mbimxsd-add-backlight-and-lcd-support.patch \
	file://0012-ARM-imx-eukrea_mbimxsd25-don-t-free-twice-GPIO_SWITC.patch \
	file://0013-ARM-imx-eukrea_mbimxsd25-use-IMX_GPIO_NR.patch \
	file://0014-ARM-imx-eukrea_mbimxsd-rename-to-eukrea_mbimxsd51.patch \
	file://0015-import-FSL-s-ADC-TS-driver.patch \
	file://0016-ARM-imx-eukrea_mbimxsd25-add-WVGA-display-timings.patch \
	file://0017-ARM-imx-eukrea_mbimxsd35-add-WVGA-display-timings.patch \
	file://0018-Add-a-mfd-IPUv3-driver.patch \
	file://0019-mxc-devices-commont-don-t-mix-MX3-MX5-IPU.patch \
	file://0020-mx51-increase-DMA-consistent-size-to-support-larger-.patch \
	file://0021-ARM-imx-eukrea_mbimxsd51-add-display-support.patch \
	file://0023-tsc2007-configure-IRQ-on-falling-edge.patch \
	file://0024-ipu-hack-to-fix-wrong-colors.patch \
	file://0001-eukrea-cpuimx25-add-4.3-WQVGA-display.patch \
	file://0001-eukrea-cpuimx51sd-fix-audio-by-providing-the-correct.patch \
	file://0001-net-phy-smsc-Implement-PHY-config_init-for-LAN87xx.patch \
	file://0001-ARM-7668-1-fix-memset-related-crashes-caused-by-rece.patch \
	file://0002-ARM-7670-1-fix-the-memset-fix.patch \
	file://logo_linux_clut224.ppm \
	"

SRC_URI_append_eukrea-cpuimx51 = " \
           file://sdma-imx51.bin \
"
       
SRC_URI[kernel.md5sum] = "75ce4d56658db99b5ec2ec20b349dbdb"
SRC_URI[kernel.sha256sum] = "d8aac289e728ef1020ebbdf0c2b68da3821a65903283ae2c4546f3290fbd7482"
