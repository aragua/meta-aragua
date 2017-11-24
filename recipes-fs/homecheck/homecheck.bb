SUMMARY = "Home directory checker"
DESCRIPTION = "Scripts and configuration files to check home directory structure on server."
LICENSE="CLOSED"

SRC_URI = "file://homecheck.sh \
	   file://homecheck.service \
"

SYSTEMD_SERVICE_${PN} = "homecheck.service"
SYSTEMD_AUTO_ENABLE = "enable"
inherit systemd allarch

do_install () {
	   install -d ${D}${systemd_system_unitdir}
	   install -m 0644 ${WORKDIR}/homecheck.service ${D}${systemd_system_unitdir}/

	   install -d ${D}${sbindir}
	   install -m 0755 ${WORKDIR}/homecheck.sh ${D}${sbindir}/homecheck
}


FILES_${PN} = " \
	    ${systemd_system_unitdir}/* \
	    ${sbindir}/* \
"
