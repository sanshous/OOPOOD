package command;

import command.LikeCommand;
import command.LikeCommandHandler;
import command.PostCommand;
import command.PostCommandHandler;

public class Dispatcher implements CommandDispatcher {
    @Override
    public void execute(Command command) {
        if(command instanceof CommentCommand) {
            CommandHandler commentCommandHandler = new CommentCommandHandler();
            commentCommandHandler.execute(command);
        }
        else if(command instanceof LikeCommand) {
            CommandHandler likeCommandHandler = new LikeCommandHandler();
            likeCommandHandler.execute(command);
        }
        else if(command instanceof PostCommand) {
            CommandHandler postCommandHandler = new PostCommandHandler();
            postCommandHandler.execute(command);
        }
    }
}
