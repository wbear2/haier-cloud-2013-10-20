package cn.edu.sjtu.se.dslab.haiercloud.deploy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMongoDBDeploy {

	public static void main(String[] args) {
		String ip1="192.168.1.254";
		String pwd1="111111";
		String ip2="192.168.1.253";
		String pwd2="111111";
		String ip3="192.168.1.252";
		String pwd3="111111";
		String ip4="192.168.1.251";
		String pwd4="111111";
		Map<String,String> shardMap1=new HashMap<String,String>();
		shardMap1.put(ip1,pwd1);
		shardMap1.put(ip2,pwd2);
		Map<String,String> shardMap2=new HashMap<String,String>();
		shardMap2.put(ip3, pwd3);
		shardMap2.put(ip4, pwd4);
		
		Map<String,String> configServerMap=new HashMap<String,String>();
		configServerMap.put(ip1, pwd1);
		configServerMap.put(ip2,pwd2);
		configServerMap.put(ip3, pwd3);
		
		Map<String,String> mongosMap=new HashMap<String,String>();
		mongosMap.put(ip4, pwd4);
		
		ShardInfos shard1=new ShardInfos("xjtu",shardMap1,"","");
		ShardInfos shard2=new ShardInfos("sjtu",shardMap2,"","");
		List<ShardInfos> shardList=new ArrayList<ShardInfos>();
		shardList.add(shard1);
		shardList.add(shard2);
		
		MongoDBArguments ma=new MongoDBArguments();
		ma.setClusterName("myMongoDB");
		ma.setConfigServerMap(configServerMap);
		ma.setMongosMap(mongosMap);
		ma.setShardInfos(shardList);
		
		DeployMongoDBCluster deployer=new DeployMongoDBCluster();
		//deployer.addCluster(ma);
		
	}

}
