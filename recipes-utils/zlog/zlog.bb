DESCRIPTION = "Zlog is a pure C logging library"
HOMEPAGE = "https://github.com/HardySimpson/zlog"
LICENSE = "GPLv3"

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

PR = "r0"
PV = "1.2.11"

SRC_URI[md5sum] = "cb8b5dc15cbb1e155330a0af23ae8df1"
SRC_URI[sha256sum] = "c4b8d9ed9792a4e3cc3735b68bbc3af6fa89c6da328c3088d336550ba32f35ba"

SRC_URI = "${HOMEPAGE}/archive/${PV}.tar.gz \
	   file://zlog.conf "

inherit pkgconfig

do_compile(){
	make CC="${CC}"
}

do_install() {
	install -d ${D}${sysconfdir}
	install -d ${D}/usr
	make PREFIX=${D}/usr install
	install -m 0755 ${WORKDIR}/zlog.conf ${D}${sysconfdir}/zlog.conf
}

