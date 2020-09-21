//package com.banyexitou.homework.recursion;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class FilterTreeNode {
//    private Logger logger = LoggerFactory.getLogger(FilterTreeNode.class);
//    private TreeNode node0;
//    private List<String> targetNode = Lists.newArrayList("B1","C1");
//
//    @Before
//    public void init(){
//        node0 = TreeNode.builder().nodeCode("0").nodeName("A").build();
//        TreeNode node1 = TreeNode.builder().nodeCode("1").nodeName("B").build();
//        TreeNode node2 = TreeNode.builder().nodeCode("2").nodeName("C").build();
//        TreeNode node3 = TreeNode.builder().nodeCode("3").nodeName("D").build();
//
//        TreeNode node4 = TreeNode.builder().nodeCode("4").nodeName("B1").build();
//        TreeNode node5 = TreeNode.builder().nodeCode("5").nodeName("B2").build();
//        TreeNode node6 = TreeNode.builder().nodeCode("6").nodeName("C1").build();
//        TreeNode node7 = TreeNode.builder().nodeCode("7").nodeName("D1").build();
//        TreeNode node8 = TreeNode.builder().nodeCode("8").nodeName("D2").build();
//
//        node1.setChildren(Arrays.asList(node4,node5));
//        node2.setChildren(Arrays.asList(node6));
//        node3.setChildren(Arrays.asList(node7,node8));
//
//        node0.setChildren(Arrays.asList(node1,node2,node3));
//    }
//
//    @Test
//    public void filterTest(){
//        logger.info("before filter node0: {}",node0);
//        TreeNode.filterNode(node0, targetNode);
//        if (node0.getChildren().size() == 0){
//            node0 = null;
//        }
//        logger.info("after filter node0: {}",node0);
//    }
