package br.edu.ifpb.padroes.storewebv3.command;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class Invoker {
    private Stack<Command> commands;

    public void addCommand(Command c)
    {
        commands.push(c);
    }

    public void executeCommands()
    {
        for(Command i: commands)
        {
            Command c = commands.pop();
            c.execute();
        }
    }
}
