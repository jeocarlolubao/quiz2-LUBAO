/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2lubao;

/**
 *
 * @author Jeo
 */
public class DList<E> {
    private DNode header, trailer;
    private int size;
    
    public DList(){
        header = new DNode(null, null, null, null, null);
        trailer = new DNode(header, null, null, null, null);
        header.setNext(trailer);
        size = 0;
    }

    /**
     * @return the header
     */
    public DNode getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(DNode header) {
        this.header = header;
    }

    /**
     * @return the trailer
     */
    public DNode getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(DNode trailer) {
        this.trailer = trailer;
    }

    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size <= 0; 
    }
    public DNode first(){
        return header.getNext();
    }
    
    public DNode last(){
        return trailer.getPrev();
    }
    
    private void addBetween(DNode prevNode, DNode newNode, DNode nextNode){
        newNode.setPrev(prevNode);
        newNode.setNext(nextNode);
        prevNode.setNext(newNode);
        nextNode.setPrev(newNode);
        size++;
    }
    
    private void remove(DNode node){
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setNext(null);
        node.setPrev(null);
        size--;
    }
    
    public void addFirst(DNode newNode){
        addBetween(header, newNode, header.getNext());
    }
    public void addLast(DNode newNode){
        addBetween(trailer.getPrev(), newNode, trailer);
    }
    
    public DNode removeFirst(){
        DNode temp = trailer.getPrev();
        remove(header.getNext());
        return temp;
    }
    
    public DNode removeLast(){
        DNode temp = trailer.getPrev();
        remove(trailer.getPrev());
        return temp;
    }
    
    public void ofDoublyLinkedList(){
        DNode<String> tempNode = header.getNext();
        
        for (int i = 0; i < size; i++) {
            System.out.print("[" + tempNode.getElement1() +", " + tempNode.getElement2() +", " + tempNode.getElement3() + "] ->");
            tempNode = tempNode.getNext();
        }
    } 
}
