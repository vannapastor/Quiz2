/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author user
 */
public class Person<P>{
    private Person prev,next;
        private P element;
        private String firstN;
        private String lastN;
        private String add;
        
        public Person(Person prev,P element,Person next,String firstN,String lastN,String add){
                this.prev = prev;
                this.element = element;
                this.firstN = firstN;
                this.lastN = lastN;
                this.add = add;              
        }
        
    /**
     * @return the prev
     */
    public Person getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Person prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public Person getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Person next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public P getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(P element) {
        this.element = element;
    }

    /**
     * @return the firstN
     */
    public String getFirstN() {
        return firstN;
    }

    /**
     * @param firstN the firstN to set
     */
    public void setFirstN(String firstN) {
        this.firstN= firstN;
    }

    /**
     * @return the lastN
     */
    public String getLastN() {
        return lastN;
    }

    /**
     * @param lastN the lastNto set
     */
    public void setLastN (String lastN) {
        this.lastN = lastN;
    }

    /**
     * @return the add
     */
    public String getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(String add) {
        this.add = add;
    }
        
                
}


  

    