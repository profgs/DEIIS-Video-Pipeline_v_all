
/* First created by JCasGen Tue May 13 03:56:32 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue May 13 03:56:48 CDT 2014
 * @generated */
public class ScoreAnnotation_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoreAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoreAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoreAnnotation(addr, ScoreAnnotation_Type.this);
  			   ScoreAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoreAnnotation(addr, ScoreAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoreAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.ScoreAnnotation");
 
  /** @generated */
  final Feature casFeat_scoreMetric;
  /** @generated */
  final int     casFeatCode_scoreMetric;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScoreMetric(int addr) {
        if (featOkTst && casFeat_scoreMetric == null)
      jcas.throwFeatMissing("scoreMetric", "mx.itam.deiis.types.ScoreAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_scoreMetric);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScoreMetric(int addr, String v) {
        if (featOkTst && casFeat_scoreMetric == null)
      jcas.throwFeatMissing("scoreMetric", "mx.itam.deiis.types.ScoreAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_scoreMetric, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ScoreAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_scoreMetric = jcas.getRequiredFeatureDE(casType, "scoreMetric", "uima.cas.String", featOkTst);
    casFeatCode_scoreMetric  = (null == casFeat_scoreMetric) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoreMetric).getCode();

  }
}



    