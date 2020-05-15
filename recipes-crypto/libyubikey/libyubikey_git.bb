include ${BPN}.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI += "\
    git://github.com/Yubico/yubico-c.git \
"

def version_git(d):
    version = d.getVar("PREFERRED_VERSION_%s" % d.getVar('PN'))
    if version is not None and "git" in version:
        return d.getVar("AUTOREV")
    else:
        return "e0aed318e403c985415b797f06db748f45bf755e"

SRCREV ?= "${@version_git(d)}"

S = "${WORKDIR}/git"
