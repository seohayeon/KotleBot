package listener
import command.CommandManager
import com.kaling.KakaoLinkClient
import util.Util
import org.socis.event.EventListenerService
import org.socis.event.message.MessageEvent
import logger.Log


class MessageEvent :EventListenerService(){
    val manager = CommandManager()
    val baseUrl = "http://pocript.com/api/tamagotchi/"
    var Kakao = KakaoLinkClient("b7102566a1d200209f5276077b291220","https://melon.com")
    
    init{
        
        Log.s("카카오 로그인 성공")
    }
    
    override fun onMessage(event:MessageEvent) {
        manager.handleCommand(event,Kakao)
        val msg = event.getMessage()
        val sender = event.getAuthor().getName()
        Log.d("[$sender] $msg")
    }
}