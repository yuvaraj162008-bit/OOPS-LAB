public class WrapperClassDemo
{
public static void main(String[]args)
{
int primitiveInt=100;
float primitiveFloat=25.75f;
char primitiveChar='A';
boolean primitiveBoolean=true;
Integer wrappedInt=primitiveInt;
Float wrappedFloat=primitiveFloat;
Character wrappedChar=primitiveChar;
Boolean wrappedBoolean=primitiveBoolean;
System.out.println("Autoboxed integer:"+wrappedInt);
System.out.println("Autoboxed float:"+wrappedFloat);
System.out.println("Autoboxed character:"+wrappedChar);
System.out.println("Autoboxed Boolean:"+wrappedBoolean);
int unboxedInt=wrappedInt;
float unboxedFloat=wrappedFloat;
char unboxedChar=wrappedChar;
boolean unboxedBoolean=wrappedBoolean;
System.out.println("unboxed int:"+unboxedInt);
System.out.println("unboxed float:"+unboxedFloat);
System.out.println("unboxed Char:"+unboxedChar);
System.out.println("unboxed boolean:"+unboxedBoolean);
String intString="300";
Integer parsedInt=Integer.parseInt(intString);
String floatString="75.25";
Float parsedFloat=Float.parseFloat(floatString);
String charString="C";
Character parsedChar=charString.charAt(0);
String booleanString="true";
Boolean parsedBoolean=Boolean.parseBoolean(booleanString);
System.out.println("parsed and autoboxed integer:"+parsedInt);
System.out.println("parsed and autoboxed float:"+parsedFloat);
System.out.println("parsed and autoboxed character:"+parsedChar);
System.out.println("parsed and autoboxed boolean:"+parsedBoolean);
}
}
