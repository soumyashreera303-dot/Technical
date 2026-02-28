package String;

public class BuilderBufferPerformace {
    public static void main(String[] args){
        long startTime= System.currentTimeMillis();
        StringBuffer sbf= new StringBuffer("Placements");
        for(int i=0; i<10000000; i++){
            sbf.append("Training");
        }
        System.out.println("Time taken by string buffer: "+(System.currentTimeMillis()-startTime)+ "ms");

        startTime= System.currentTimeMillis();
        StringBuilder sbl= new StringBuilder("Placements");
        for(int i=0; i<10000000; i++){
            sbl.append("Training");
        }
        System.out.println("Time taken by string builder: "+(System.currentTimeMillis()-startTime)+ "ms");
    }
}
