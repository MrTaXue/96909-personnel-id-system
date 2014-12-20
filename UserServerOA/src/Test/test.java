package Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.jsp.jstl.sql.Result;

import com.br.utils.commons.DBHelper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entity entity1=new Entity("a1230","123456aaa",12);
		Entity entity2=new Entity("a1230","123456aaa",12);
		List<Entity> list=new ArrayList<Entity>();
		list.add(entity1);
		list.add(entity2);
		Map m=new HashMap();
		m.put("totle", 2);
		m.put("rows", list);
		JSONArray jsonArray = JSONArray.fromObject(m);
		System.out.println(jsonArray.toString());
	}
}
