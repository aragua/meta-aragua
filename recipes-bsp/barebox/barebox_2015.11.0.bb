include barebox.inc

COMPATIBLE_MACHINE = "(eukrea-cpuimx51)"
DEFAULT_PREFERENCE_eukrea-cpuimx51 = "1"

PR = "r1"

SRC_URI += " file://defconfig "

SRC_URI[md5sum] = "05951fa64000f5baedfc1064dbcfcad0"
SRC_URI[sha256sum] = "ea40cef0a5ef76c4d68e76ac0e5c71c758c563ffa48c08e0b284688ec6f9d422"
