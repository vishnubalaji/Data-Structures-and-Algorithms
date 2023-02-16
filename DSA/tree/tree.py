from math import ceil
from sys import prefix
from unicodedata import name


class TreeNode:
    def __init__(self,data):
        self.data = data
        self.parent = None
        self.children =[]

    def add_child(self, child):
        child.parent = self
        self.children.append(child)

    def print_tree(self):
        space = ' '*self.get_level()*3
        prefix = space + '|__' if self.parent else ''
        print(prefix+self.data)
        if self.children:
            for child in self.children:
                child.print_tree()
    
    def get_level(self):
        level = 0
        p = self.parent
        while p:
            level+=1
            p = p.parent
        return level
        
# Building an organizational tree
def build_product_tree():
    ceo = TreeNode("CEO")
    cto = TreeNode("CTO")
    
    infra_head = TreeNode("Infrastructure head")
    infra_head.add_child(TreeNode("Cloud Manager"))
    infra_head.add_child(TreeNode("App Manager"))

    cto.add_child(infra_head)
    ceo.add_child(cto)

    ceo.print_tree()


if __name__ == '__main__':
    build_product_tree()