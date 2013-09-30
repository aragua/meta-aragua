IMAGE_FEATURES += " ssh-server-dropbear nano"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " nano ${CORE_IMAGE_BASE_INSTALL} "

IMAGE_FSTYPE = " cpio.gz "
