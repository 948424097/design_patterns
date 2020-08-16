package com.banyexitou.bak.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
