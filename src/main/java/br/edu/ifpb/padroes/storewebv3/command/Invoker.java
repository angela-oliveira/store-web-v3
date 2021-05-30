package br.edu.ifpb.padroes.storewebv3.command;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Invoker {
    private ArrayList<Command> commands = new ArrayList<Command>();;
    
    public void addCommand(Command c)
    {
        commands.add(c);
    }

    public void executeCommands()
    {
        for(int i=0; i<commands.size(); i++)
        {
        	commands.get(i).execute();
        	commands.remove(i);
        }
    }
}
