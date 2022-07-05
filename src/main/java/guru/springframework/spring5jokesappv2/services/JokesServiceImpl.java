package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service("joky")
public class JokesServiceImpl implements JokesService {
  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokesServiceImpl(){
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getQuote() {
    return this.chuckNorrisQuotes.getRandomQuote();
  }
}
