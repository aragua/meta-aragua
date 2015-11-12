require barebox.inc

COMPATIBLE_MACHINE = "(eukrea-cpuimx51)"
DEFAULT_PREFERENCE_eukrea-cpuimx51 = "1"
BAREBOX_DEFAULTENV = ""

PR = "r1"

SRC_URI += " file://defconfig "

SRC_URI_append_eukrea = " \
	file://0001-usb_hub_power_on-wait-for-the-power-to-be-stable.patch \
	file://0002-net-miidev-really-wait-for-auto-negotiation.patch \
	file://0003-fec-restart-autoneg-at-open-instead-of-init.patch \
	file://0004-i.MX51-unbreak-FEC-iomux.patch \
	file://0005-miidev-fix-1G-wrong-detection.patch \
	file://0001-eukrea-cpuimx25-add-128MB-configuration.patch \
	file://0002-eukrea-cpuimx25-add-WQVGA-display-choice.patch \
	"

SRC_URI[md5sum] = "494da74088074e65366f511ec6209e21"
SRC_URI[sha256sum] = "0983b4f59f3eafd30a4eaed14b90313d67014c70c45235de5cc8e8574a316c47"
