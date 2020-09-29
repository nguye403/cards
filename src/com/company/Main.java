package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JFrame{
    public static void main (String[] args){
        Main frame = new Main();
        frame.setTitle("Cards");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private ImageIcon Card1 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/AC.png");
    private ImageIcon Card2 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/2C.png");
    private ImageIcon Card3 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/3C.png");
    private ImageIcon Card4 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/4C.png");
    private ImageIcon Card5 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/5C.png");
    private ImageIcon Card6 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/6C.png");
    private ImageIcon Card7 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/7C.png");
    private ImageIcon Card8 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/8C.png");
    private ImageIcon Card9 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/9C.png");
    private ImageIcon Card10 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/10C.png");
    private ImageIcon Card11 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/JC.png");
    private ImageIcon Card12 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/QC.png");
    private ImageIcon Card13 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs/KC.png");


    public Main(){
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(Card1));
        add(new JLabel(Card2));
        add(new JLabel(Card3));
        add(new JLabel(Card4));
        add(new JLabel(Card5));
        add(new JLabel(Card6));
        add(new JLabel(Card7));
        add(new JLabel(Card8));
        add(new JLabel(Card9));
        add(new JLabel(Card10));
        add(new JLabel(Card11));
        add(new JLabel(Card12));
        add(new JLabel(Card13));
        }
    }
