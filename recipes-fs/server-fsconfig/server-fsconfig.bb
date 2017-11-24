SUMMARY = "File system configuration for Server"
DESCRIPTION = "Scripts and configuration files to set up filesystem on server."
LICENSE="CLOSED"

SRC_URI = "file://home.mount"

inherit systemd allarch

do_install () {
	   install -d ${D}${sysconfdir}/systemd/system
	   install -m 0644 ${WORKDIR}/home.mount ${D}${sysconfdir}/systemd/system/
}


FILES_${PN} = " \
	    ${sysconfdir}/* \
"
