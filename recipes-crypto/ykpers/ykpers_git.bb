include ${BPN}.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI += "\
    git://github.com/Yubico/yubikey-personalization.git \
"

def version_git(d):
    version = d.getVar("PREFERRED_VERSION_%s" % d.getVar('PN'))
    if version is not None and "git" in version:
        return d.getVar("AUTOREV")
    else:
        return "fa5cf5ac18ca4419c9274717b89ed1f1f482ba30"

SRCREV ?= "${@version_git(d)}"

S = "${WORKDIR}/git"
