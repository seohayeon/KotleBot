package command.commands

import command.commands.ICommand
import java.util.*
import command.CommandManager
import org.socis.event.message.MessageEvent
import com.kaling.KakaoLinkClient



class PlayCommand : ICommand {
    
    override fun handle(event: MessageEvent,Kakao:KakaoLinkClient){
            event.channel.sendMessage("pong!")
    }
    override val help: String? = "재생명령어"
    override val invoke: String = "시작"
}