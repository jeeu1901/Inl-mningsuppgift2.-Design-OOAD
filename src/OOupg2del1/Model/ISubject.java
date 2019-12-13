package OOupg2del1.Model;

import OOupg2del1.Controller.IObersver;

public interface ISubject {
    public void attach(IObersver o);
    public void detach(IObersver o);
    public void notify1();
}
