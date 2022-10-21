import java.util.Iterator;

class ClassProductList implements Contain {
    public String ClassProductList[] ={"Meat","Milk","Chicken"};
    @Override
    public Iterator createIterator() {

        return new Namesiterator();
    }
    private class Namesiterator implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i < ClassProductList.length) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return ClassProductList[i++];
            }return null;
        }
        }
    }

