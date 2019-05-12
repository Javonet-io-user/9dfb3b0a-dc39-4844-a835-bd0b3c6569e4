package Aspose.Tasks.Visualization;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Aspose.Tasks.Visualization.*;
import jio.System.Drawing.*;
import jio.System.*;

public interface IHitable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsHit(Point point);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IHitTestResult getResult();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Rectangle getHitableRect();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getHitableUID();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getHitableText();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getHitableObject();
}
