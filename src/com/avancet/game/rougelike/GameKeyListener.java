package com.avancet.game.rougelike;

import java.awt.Graphics;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.avancet.game.rougelike.creatures.Player;
import com.avancet.game.rougelike.helper.GameLogger;

public class GameKeyListener implements KeyListener, KeyEventDispatcher {

	private Player player;

	private GameMap map;

	private JFrame frame;

	private boolean isPressed;

	public GameKeyListener(Player player, GameMap map, JFrame frame) {
		GameLogger.getLogger().info("Create the GameKeyListener.");
		this.player = player;
		this.map = map;
		this.frame = frame;
		this.isPressed = false;
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		//Erst nach loslassen der Taste wieder bewegen können
		GameLogger.getLogger().debug("Key " + e.getKeyChar() + " was pressed");
		if (e.getKeyChar() == 'w')
			player.movePlayer("UP", map);
		else if (e.getKeyChar() == 's')
			player.movePlayer("DOWN", map);
		else if (e.getKeyChar() == 'a')
			player.movePlayer("LEFT", map);
		else if (e.getKeyChar() == 'd')
			player.movePlayer("RIGHT", map);
		this.frame.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
