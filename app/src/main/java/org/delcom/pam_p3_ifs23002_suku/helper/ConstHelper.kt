package org.delcom.pam_p3_ifs23002_suku.helper
class ConstHelper {
    // Route Names
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Plants(path = "plants"),
        PlantsDetail(path = "plants/{name}"),
    }
}