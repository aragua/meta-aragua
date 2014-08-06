# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

#include linux-riotboard.inc
SUMMARY = "Linux kernel for Riotboard"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"


require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SCMVERSION = "n"

LINUX_VERSION = "linux-3.15.7"

SRC_URI = " https://www.kernel.org/pub/linux/kernel/v3.x/${LINUX_VERSION}.tar.xz \
           file://defconfig \
	   file://0001-add-riotboard-device-tree.patch "

S = "${WORKDIR}/${LINUX_VERSION}"

SRC_URI[md5sum] = "08ef71826c5a4f2e308b73903dc7f63e"
SRC_URI[sha256sum] = "d299fdff6e9eb7a9d646440a38eb5507687b048ac561db7c7458a6151f19980c"

COMPATIBLE_MACHINE = "(riotboard)"

