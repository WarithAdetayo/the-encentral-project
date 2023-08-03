// @GENERATOR:play-routes-compiler
// @SOURCE:/media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/conf/routes
// @DATE:Thu Aug 03 08:56:50 WAT 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
