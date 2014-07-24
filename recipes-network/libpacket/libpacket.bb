SUMMARY = "Library providing network packet manipulation"
HOMEPAGE = "https://github.com/aragua/libpacket"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../COPYING;beginline=7;md5=01a5cdc845ab56dec87d71b0ad5c459c"

PR = "r1"

SRCREV = "84e4d5ac9ceb4d31075e6e33b0dc4485974f1619"

SRC_URI = " git://github.com/aragua/libpacket.git;branch=master \
		file://COPYING "

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DLIB_INSTALL_DIR=${libdir} -DLIBEXEC_INSTALL_DIR=${libexecdir}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/*.so"

do_configure_prepend() {
	export HOST_SYS=${HOST_SYS}
	export BUILD_SYS=${BUILD_SYS}
}

