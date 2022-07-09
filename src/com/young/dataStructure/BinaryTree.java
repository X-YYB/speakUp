package com.young.dataStructure;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

/**
 * @Description: 二叉树实现
 * @Author: yangyb
 * @Date:2022/7/6 23:29
 * Version: 1.0
 **/
public class BinaryTree {

    public static void main(String[] args) {
        //需要实例化节点
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        //从根节点开始将一个个子节点串起来，连成一颗树形结构
        nodeA.leftNode=nodeB;
        nodeA.rightNOde=nodeC;
        nodeB.leftNode=nodeD;
        nodeB.rightNOde=nodeE;
        nodeC.rightNOde=nodeF;
        nodeE.leftNode=nodeG;

        preOrder(nodeA);
        System.out.println();

        midOrder(nodeA);
        System.out.println();
        backOrder(nodeA);
    }

    public static class Node{
        public String value;
        public Node leftNode;
        public Node rightNOde;

        public Node(String value){
           this.value=value;
        }
    }

    //前序遍历
    private static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.value);
        preOrder(root.leftNode);
        preOrder(root.rightNOde);
    }

    //中序遍历
    private static void midOrder(Node root){
        if(root==null)return;
        midOrder(root.leftNode);
        System.out.print(root.value);
        midOrder(root.rightNOde);
    }

    //后序遍历
    private static void backOrder(Node root){
        if(root==null)return;
        backOrder(root.leftNode);
        backOrder(root.rightNOde);
        System.out.print(root.value);
    }
}
