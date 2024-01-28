
package Calculator;
  

enum OperatorType {
	Add, Subtract, Multiply, Divide, Value;
	String symbol() {
		switch (this) {
                    case Add : 
                        return "+" ;
                    case Subtract :
                        return "-" ;
                    case Multiply :
                        return "*";
                    case Divide :
                        return "/";
                    case Value :
                        return " ";
                    default:
                        return null;
		}
	}
}
public class Operator{
        final double value;
	final OperatorType operatorType;
	final Operator leftChild;
	final Operator rightChild;
	Operator(double value) {
		this.value = value;
                operatorType=null;
                leftChild=null;
                rightChild=null;
        }
	Operator(OperatorType operatorType, Operator leftChild, Operator rightChild) {
                this.operatorType = operatorType;
                this.leftChild = leftChild;
                this.rightChild = rightChild;
                this.value = this.getValue();
	}	
        boolean isLeaf() {
		if(operatorType != null){
                    return true;
                }else{
                    return false;
                }
        }
	double getValue() {
		if(this.isLeaf()){
                    if(operatorType.symbol().equals("+")){
                        return leftChild.getValue()+ rightChild.getValue();
                    }else if(operatorType.symbol().equals("-")){
                        return leftChild.getValue() - rightChild.getValue();
                    }else if(operatorType.symbol().equals("*")){
                        return leftChild.getValue() * rightChild.getValue();
                    }else if(operatorType.symbol().equals("/")){
                        return leftChild.getValue() / rightChild.getValue();
                    }else{
                        return value;
                    }
                }else{
                    return value;
                }
        }
	@Override
	public String toString() {
		if(operatorType==null){
                    return Double.toString(value);
                }else{
                    if(rightChild.getValue()<0){
                        return "("+leftChild.toString()+" "+operatorType.symbol()+" ("+rightChild.toString()+")"+")"; 
                    }else{
                        return "("+leftChild.toString()+" "+operatorType.symbol()+" "+rightChild.toString()+")"; 
                    }
            }
      }
}