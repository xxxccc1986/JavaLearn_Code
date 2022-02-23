package Exer;

import java.util.*;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/17 23:51
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>() ;
    //必须在此处将map初始化完成，否则将在sava添加用户报空指针异常

    public DAO() {

    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    //自定义方法
    //保存 T 类型的对象到 Map 成员变量中
    public void save(String id, T entity){
        map.put(id,entity);
    }

    //从 map 中获取 id 对应的对象
    public T get(String id){
        return  map.get(id);
    }

    //替换 map 中 key 为 id 的内容,改为 entity
    public void update(String id,T entity){
        map.replace(id,entity);
    }

    //返回 map 中存放的所有 T 对象
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, T> map = iterator.next();
            T value = map.getValue();
            list.add(value);
        }
        return list;
    }

    //删除指定 id 对象
    public void delete(String id){
        if (map.containsKey(id)){
            map.remove(id);
        }else {
            System.out.println("无法找到指定用户");
        }

    }
}
