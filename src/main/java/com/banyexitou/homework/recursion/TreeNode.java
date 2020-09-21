package com.banyexitou.homework.recursion;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class TreeNode {
    private String nodeName;
    private String nodeCode;

    private List<TreeNode> children;

    public static List<TreeNode> filterNode(TreeNode treeNode, List<String> targetNode) {

        List<TreeNode> nodes = treeNode.getChildren();
        List<TreeNode> newNodes = new ArrayList<>();
        List<TreeNode> tagNodes = new ArrayList<>();

        for (TreeNode node : nodes) {
            if (targetNode.contains(node.getNodeName())) {
                newNodes.add(node);
            }
            if (!CollectionUtils.isEmpty(node.getChildren())) {
                List<TreeNode> retNodes = filterNode(node, targetNode);
                if (retNodes.size() > 0) {
                    node.setChildren(retNodes);
                    newNodes.add(node);
                } else {
                    // 没有子节点情况
                    node.setChildren(null);
                    // 标记,循环结束后删除
                    tagNodes.add(node);
                }
            } else {
                tagNodes.add(node);
            }
        }
        nodes.removeAll(tagNodes);
        return newNodes;
    }
}
