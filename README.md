# REST服务，使用Dubbo还是SpringMVC，这是个选择
了解Dubbo 如何实现REST 服务之前，先简单聊下 Dubbo 中关于 REST 的那部分历史。
Dubbo 于 2011 年开源，而 2014 年 开始发展停滞。早些时候的 Dubbo 是不支持 REST 的，而如果要实现一个 REST 服务，也是有办法的，可以结合 SpringMVC，在 Controller 中调 Dubbo 的Service服务。
但是 REST 这么火，不想集成SpringMVC，想直接在 Dubbo 上支持 REST 怎么办？
2014年，当当网 Fork 了一个 Dubbo 版本开始维护，命名为 DubboX，并增加了 REST 风格的远程调用。之后随着 Dubbo 和 DubboX 的合并，Dubbo 将 DubboX 中对 REST 的支持合并了进来。
现在经过孵化，Dubbo已经是Apache的顶级项目。

本Demo是springboot + dubbo(version : 2.7.8)，来实现内部rpc，外部rest
https://dubbo.apache.org/imgs/user/rest.jpg

