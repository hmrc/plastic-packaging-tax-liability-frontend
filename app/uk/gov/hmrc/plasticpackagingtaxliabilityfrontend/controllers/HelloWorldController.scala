package uk.gov.hmrc.plasticpackagingtaxliabilityfrontend.controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc._
import uk.gov.hmrc.play.bootstrap.frontend.controller.FrontendController
import uk.gov.hmrc.plasticpackagingtaxliabilityfrontend.config.AppConfig
import uk.gov.hmrc.plasticpackagingtaxliabilityfrontend.views.html.hello_world

import scala.concurrent.Future

@Singleton
class HelloWorldController @Inject()(
  appConfig: AppConfig,
  mcc: MessagesControllerComponents,
  hello_world: hello_world)
    extends FrontendController(mcc) {

  implicit val config: AppConfig = appConfig

  val helloWorld: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(hello_world()))
  }

}
