include ${BPN}.inc

SRC_URI += "\
    https://github.com/Yubico/yubico-c/archive/${BPN}-${PV}.tar.gz \
"

SRC_URI[md5sum] = "a568ce0d58e6ea77eef073f8800da7e0"
SRC_URI[sha256sum] = "dd046c83e67560206b0b3301ee8053922b516e3975b895804582eb8d7bdd1d79"

S = "${WORKDIR}/yubico-c-${BPN}-${PV}"
