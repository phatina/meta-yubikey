include ${BPN}.inc

SRC_URI += "\
    https://github.com/Yubico/yubikey-personalization/archive/v${PV}.tar.gz \
    file://disable-documentation.patch \
"

SRC_URI[md5sum] = "cefb17521fe81069e6e5ad05f5a4ee0e"
SRC_URI[sha256sum] = "12d93a40d4052ff0b597815fc85eb4de354423c41a749501cd97a2e879bebae1"

S = "${WORKDIR}/yubikey-personalization-${PV}"
