package cs102;

import ConsoleHangman.src.ConsoleHangman;
import ConsoleHangman.src.IHangmanView;

public class ConsoleHangmanView implements IHangmanView
{

    @Override
    public void updateView(Hangman hangmanModel)
    {
        if(!hangmanModel.isGameOver())
        {
            int attempt = hangmanModel.getMaxAllowedIncorrectTries() - hangmanModel.getNumOfIncorrectTries();
            System.out.println(hangmanModel.getKnownSoFar());
            System.out.println("You have " +  attempt + " tries");
        }
        else
        {
            if(hangmanModel.hasLost())
            {
                System.out.println(hangmanModel.getKnownSoFar());
                System.out.println("You lost buddy :(");
            }
            else
            {
                System.out.println(hangmanModel.getKnownSoFar());
                System.out.println("You win buddy ;))))");

            }

        }
    }
}
