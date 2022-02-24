package command.commands
import org.socis.event.message.MessageEvent
import com.kaling.KakaoLinkClient

interface ICommand {
    fun handle(event: MessageEvent,Kakao:KakaoLinkClient)
    val help: String?
    val invoke: String
}