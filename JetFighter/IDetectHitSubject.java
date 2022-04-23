/**
 * IDetectHitSubject interface declare methods to attach update score observer and
 * notify observer when detect hit.
 * 
 * @author (shradha yewale) 
 * @version (a version number or a date)
 */
public interface IDetectHitSubject  
{
    //public abstract void attach(IUpdateScoreObserver observer);
    public void notifyObservers();
}
