package cs102;

import ConsoleHangman.src.BasicSetup;
import ConsoleHangman.src.IHangmanView;

import java.util.ArrayList;

public class HangmanModel extends Hangman {

    private IHangmanView view;

    public HangmanModel(IHangmanSetup setup)
    {
        super(setup);
    }
    public void addView(IHangmanView view)
    {
        this.view = view;
    }
    public void update()
    {
        if(view != null)
        view.updateView(this);
    }
    @Override
    public int tryThis(char letter)
    {
        int num;
        num = super.tryThis(letter);
        this.update();
        return num;
    }
    @Override
    public void initNewGame()
    {
      super.initNewGame();
      this.update();
    }
}
