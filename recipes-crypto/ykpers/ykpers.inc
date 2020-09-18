SUMMARY = "Yubikey personalization tool"
DESCRIPTION = "The YubiKey Personalization package contains a library and \
command line tool used to personalize (i.e., set a AES key) YubiKeys."
HOMEPAGE = "https://github.com/Yubico/yubikey-personalization"
SECTION = "security/token"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=422217170b70a9a94c32873055b486bb"

DEPENDS += "\
    libusb1 \
    libyubikey \
"

RDEPENDS_${PN} += "\
    libusb1 \
    libyubikey \
"

EXTRA_OECONF = "\
    --disable-static \
    --disable-rpath \
    --disable-silent-rules \
    --disable-documentation \
    --with-udevrulesdir=${sysconfdir}/udev/rules.d \
    --with-backend=libusb-1.0 \
"

inherit autotools pkgconfig
