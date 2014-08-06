# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

#include linux-riotboard.inc
SUMMARY = "Linux kernel for Riotboard"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"


require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SCMVERSION = "n"

LINUX_VERSION = "linux-3.14.15"

SRC_URI = " https://www.kernel.org/pub/linux/kernel/v3.x/${LINUX_VERSION}.tar.xz \
           file://defconfig \
	   file://0001-add-support-of-riotboard.patch "

S = "${WORKDIR}/${LINUX_VERSION}"

SRC_URI[md5sum] = "89c2aaa23f95ca13447c35e514038472"
SRC_URI[sha256sum] = "209d4607320f83485a057f6fc366489ada2da7ea7ab409a4bc1f25a38fd15c72"

COMPATIBLE_MACHINE = "(riotboard)"

