SUMMARY = "Yubikey low-level C software development kit"
DESCRIPTION = "This package make up the low-level C software development kit \
for the Yubico YubiKey authentication device."
HOMEPAGE = "https://github.com/Yubico/yubico-c"
SECTION = "security/token"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=82e429e9fd33c7ce9f12030aa107402d"

DEPENDS += "\
    asciidoc-native \
    libxml2-native \
    libxslt-native \
"

EXTRA_OECONF = "--disable-static --disable-silent-rules"

inherit autotools
