package command
import command.commands.*
import java.util.*
import org.socis.event.message.MessageEvent
import com.kaling.KakaoLinkClient
import logger.Log

class CommandManager {
    private val commands: HashMap<String, ICommand> = HashMap()

    init {
            addCommand(PlayCommand())
    }

    private fun addCommand(command: ICommand) {
        if (!commands.containsKey(command.invoke)) {
            commands.put(command.invoke, command)
            Log.i("'" + command.invoke + "' 명령어 추가됨")
        }
    }
 
    fun getCommands(): Collection<ICommand?>? {
        return commands.values
    }

    fun getCommand(name: String?): ICommand? {
        return commands[name]
    }

    fun handleCommand(event: MessageEvent,Kakao:KakaoLinkClient) {
        var prefix = "."
        val split: List<String> = event.getMessage()
                .replaceFirst(prefix, "")
                .split("\\s+".toRegex());
        val invoke = split[0].toLowerCase()
        
        if (commands.containsKey(invoke)) {
            commands.get(invoke)?.handle(event,Kakao)
        }
    }
}
